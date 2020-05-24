package com.denlaku.springboot;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ExpressionParserTest {

	@Test
	public void test01() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("'abcd'.getBytes()");
		Object value = expression.getValue();
		byte[] value2 = expression.getValue(byte[].class);
		
		System.out.println(value.getClass());
		System.out.println(Arrays.toString(value2));
	}
}
