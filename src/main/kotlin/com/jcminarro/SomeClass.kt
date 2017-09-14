package com.jcminarro


class SomeClass {

    fun invert(input: Input, callback: Callback) {
        callback.result(Output(input.bar, input.foo))
    }
}

interface Callback{
    fun result(output: Output)
}

class Input(val foo: Boolean, val bar: Boolean)
class Output(val foo: Boolean, val bar: Boolean)


