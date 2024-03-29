package me.snoty

import org.junit.Test
import kotlin.test.assertEquals


class MyTest {
	@Test
	fun failedTest() {
		assertEquals(1, 2)
	}

	@Test
	fun workingTest() {
		assertEquals(0, 0)
	}
}
