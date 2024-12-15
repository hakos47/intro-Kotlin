package Objects.Exercise7

class Admin(
    id: Int,
    name: String,
    email: String
) : User(id, name, email), AdminIterface {
    private val managedUsers : MutableList<User> = mutableListOf()
    init {
        addRole(Role.ADMIN)
    }

    override fun manageUsers() {
        if (!hasRole(Role.ADMIN)) {
            println("Access denied. Only administrators can manage users.")
            return
        }

        println("Managing users...")
        println("Options:")
        println("1. List all users")
        println("2. Add a user")
        println("3. Remove a user")
        println("4. Exit")

        while (true) {
            print("Select an option: ")
            val option = readln().toIntOrNull()
            when (option) {
                1 -> listUsers()
                2 -> addUser()
                3 -> removeUser()
                4 -> {
                    println("Exiting user management.")
                    break
                }
                else -> println("Invalid option. Please try again.")
            }
        }
    }

    private fun listUsers() {
        val users = UserRegistry.getAllUsers()
        if (users.isEmpty()) {
            println("No users to display.")
        } else {
            println("All Users:")
            users.forEachIndexed { index, user ->
                println("${index + 1}. ${user.name} (${user.email}) - Roles: ${user.getRoles()}")
            }
        }
    }

    private fun addUser() {
        print("Enter user ID: ")
        val id = readln().toIntOrNull() ?: run {
            println("Invalid ID.")
            return
        }
        print("Enter user name: ")
        val name = readln()
        print("Enter user email: ")
        val email = readln()
        val newUser = User(id, name, email)
        UserRegistry.addUser(newUser)
        println("User added successfully.")
    }

    private fun removeUser() {
        listUsers()
        val users = UserRegistry.getAllUsers()
        if (users.isEmpty()) return
        print("Enter the number of the user to remove: ")
        val index = readln().toIntOrNull()?.minus(1) ?: run {
            println("Invalid number.")
            return
        }
        if (index in users.indices) {
            val removedUser = users[index]
            UserRegistry.removeUser(removedUser)
            println("Removed user: ${removedUser.name}")
        } else {
            println("Invalid selection. No user removed.")
        }
    }

    override fun viewSystemLogs() {
        println("Viewing system logs ...")
    }
}