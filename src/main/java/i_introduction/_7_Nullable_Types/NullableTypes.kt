package i_introduction._7_Nullable_Types

import util.TODO
import util.doc5

fun todoTask5(client: Client?, message: String?, mailer: Mailer): Nothing = TODO(
    """
        Task 5.
        Rewrite JavaCode5.sendMessageToClient in Kotlin, using only one 'if' expression.
        Declarations of Client, PersonalInfo and Mailer are given below.
    """,
    documentation = doc5(),
    references = { i_introduction._7_Nullable_Types.sendMessageToClient(client, message, mailer) }
)

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    val personalInfo = client?.personalInfo
    val email = personalInfo?.email
    if(email != null && message != null)
        mailer.sendMessage(email,message)
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}
