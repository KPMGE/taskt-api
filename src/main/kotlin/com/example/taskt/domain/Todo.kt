
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Column
import org.springframework.data.annotation.Id

@Entity
data class Todo (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val done: Boolean = false,

    @Column(nullable = true)
    val description: String? = null,

    @Column(nullable = false)
    val hexColor: String
)
