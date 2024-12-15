package Objects.Exercise7

object UserRegistry {
    private val users = mutableListOf<User>()

    fun addUser(user: User) {
        users.add(user)
    }

    fun removeUser(user: User) {
        users.remove(user)
    }

    fun getAllUsers(): List<User> {
        return users
    }
}