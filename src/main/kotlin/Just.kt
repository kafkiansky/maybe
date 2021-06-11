package maybe

class Just<T: Any?>(private val value: T): Maybe<T> {
    override fun exists(): Boolean = true
    override fun value(): T? = this.value
}

fun<T> just(value: T): Just<T> {
    return Just(value)
}
