package Objects.Exercise7

open class User(
    override val id: Int,
    override val name: String,
    override val email: String,
) : UserInterface {
    private val roles : MutableList<Role> = mutableListOf(Role.USER)

    override fun addRole(role: Role) {
        if (role !in roles) {
            roles.add(role)
        }
    }

    override fun removeRole(role: Role) {
        roles.remove(role)
    }

    override fun hasRole(role: Role) : Boolean {
        return role in roles
    }

    override fun getRoles(): List<Role> {
        return roles.toList()
    }
    override fun toString(): String {
        return "User(id=$id, name='$name', email='$email', roles=$roles)"
    }
}