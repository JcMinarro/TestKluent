package com.jcminarro

import com.nhaarman.mockito_kotlin.verify
import org.amshove.kluent.*
import org.junit.Test

class SomeClassTest{

    val callback: Callback = mock()
    val someClass = SomeClass()

    @Test
    fun `Should invert the input values`(){
        val input = Input(true, false)
        someClass.invert(input, callback)
        verify(callback).result(com.nhaarman.mockito_kotlin.check {
            it.bar `should be`  input.foo
            it.foo `should be` input.bar
        })
    }

    @Test
    fun `Should invert the input values use Kluent`(){
        val input = Input(true, false)
        someClass.invert(input, callback)
        Verify that callback.result(com.nhaarman.mockito_kotlin.check {
            it.bar `should be`  input.foo
            it.foo `should be` input.bar
        }) was called
    }

    @Test
    fun `This test should fail because the inversion check is wrong`(){
        val input = Input(true, false)
        someClass.invert(input, callback)
        verify(callback).result(com.nhaarman.mockito_kotlin.check {
            it.bar `should be`  input.bar
            it.foo `should be` input.foo
        })
    }

    @Test
    fun `This test should fail because the inversion check is wrong Kluent`(){
        val input = Input(true, false)
        someClass.invert(input, callback)
        Verify that callback.result(com.nhaarman.mockito_kotlin.check {
            it.bar `should be`  input.bar
            it.foo `should be` input.foo
        }) was called
    }
}