package Objects.Exercise7

interface RoleManagerInterface {
    fun addRole(role: Role)
    fun removeRole(role: Role)
    fun getRoles(): List<Role>
    fun hasRole(role: Role): Boolean
}