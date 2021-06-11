package maybe

interface Maybe<T: Any?> {
    fun exists(): Boolean
    fun value(): T?
}
