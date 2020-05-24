package com.denlaku.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.denlaku.springboot.dao.TxDao;
import com.denlaku.springboot.vo.Tx;

@Service
public class TxService {

	@Autowired
	private TxDao txDao;
	@Autowired
	private PlatformTransactionManager txManager;

	public int add(Tx tx) {
		TransactionDefinition definition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = txManager.getTransaction(definition);
		int i = 0;
		try {
			i = txDao.add(tx);
			add2(tx);
			txManager.commit(transactionStatus);
		} catch (Exception e) {
			txManager.rollback(transactionStatus);
		}
		return i;
	}

	public int add2(Tx tx) {
		TransactionDefinition definition = new DefaultTransactionDefinition(
				TransactionDefinition.PROPAGATION_SUPPORTS);
		TransactionStatus transactionStatus = txManager.getTransaction(definition);
		int i = 0;
		try {
			tx.setName(tx.getName() + "--");
			i = txDao.add(tx);
			txManager.commit(transactionStatus);
		} catch (Exception e) {
			txManager.rollback(transactionStatus);
		}
		return i;
	}

}
