package maybe

class Nothing<T: Any?>: Maybe<T> {
    override fun exists(): Boolean = false
    override fun value(): T? = null
}

fun nothing(): Nothing<Any?> {
    return Nothing()
}
