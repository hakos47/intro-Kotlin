package Objects

import Objects.Exercise7.*

fun exercise7() {
    val user1 = User(id = 1, name = "John Doe", email = "john.doe@example.com")
    UserRegistry.addUser(user1)
    println("User1: $user1")

    val admin1 = Admin(id = 2, name = "Admin User", email = "admin@example.com")
    UserRegistry.addUser(admin1)
    println("Admin1: $admin1")

    println("User roles: ${user1.getRoles()}")
    println("Admin roles: ${admin1.getRoles()}")
    admin1.manageUsers()
}