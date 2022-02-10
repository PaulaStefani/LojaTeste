class Filial {
    var email: String? = null
        get() = if (field.isNullOrEmpty()) "Email da filial não foi informado" else field set (value){
            field = if (value.isNullOrEmpty()) null else value
        }
    var quantidadeFuncionarios: String? = null
        get() = if (field.isNullOrEmpty()) "Quantidade de funcionários da filial não foi informada" else field set (value){
            field = if (value!!.length < 10) null else value
        }

    var telefonecomercial: String? = null
        get() = if (field.isNullOrEmpty()) "Telefone comercial da filial não foi informado" else field set (value){
            field = if (field!!.length >= 11) null else value
        }

}
