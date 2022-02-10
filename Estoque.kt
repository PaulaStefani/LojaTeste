class estoque {
    var quantidadeDisponivel: String? = null
    get() = if (field.isNullOrEmpty()) "Quantidade disponível não informada" else field set (value){
        field = if (value.isNullOrEmpty()) null else value
    }
    var produto: String? = null
    get() = if (field.isNullOrEmpty()) "Produto não informado" else field set (value){
        field = if (value.isNullOrEmpty()) null else value
    }
    var quantidadeVendida: String? = null
    get() = if (field.isNullOrEmpty()) "Quantidade disponível não informada" else field set (value){
        field = if (value.isNullOrEmpty()) null else value
    }
}
