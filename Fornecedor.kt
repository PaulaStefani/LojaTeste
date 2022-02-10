class Fornecedor {
    var nome: String? = null
        get() = if (field.isNullOrEmpty()) "Nome do fornecedor não informado" else field
        set(value) {
            field = if (value!!.length < 2) null else value
        }
    var email: String? = null
        get() = if (field.isNullOrEmpty()) "Email do fornecedor não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var telefoneComercial: String? = null
        get() = if (field.isNullOrEmpty()) "Telefone comercial do fornecedor não infomado" else field
        set(value) {
            field = if (value!!.length >= 11) value else null
        }
}
