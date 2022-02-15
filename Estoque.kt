class estoque {
    var quantidadeDisponivel: Float? = null
   get() = if(field.isNullOrEmpty()) "Quantidade disponível não registrada" else field
        set(value) {
            if (value.isNullOrEmpty()) null else value
        }
    }
    var produto: String? = null
      get() = if(field.isNullOrEmpty()) "Não há produtos registrados" else field
        set(value) {
            if (value.isNullOrEmpty()) null else value
        }
    var quantidadeVendida: Flaot? = null
    get() = if (field.isNullOrEmpty()) "Quantidade disponível não informada" else field set (value){
        field = if (value.isNullOrEmpty()) null else value
    }
}
