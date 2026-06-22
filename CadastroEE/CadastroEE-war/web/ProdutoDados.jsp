<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html><html><head><title>Cadastro Produto</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head><body class="container">
<h2>Cadastro de Produto</h2>
<form method="post" action="ServletProdutoFC">
<div class="mb-3"><label class="form-label">Nome</label><input class="form-control" name="nome"></div>
<div class="mb-3"><label class="form-label">Quantidade</label><input class="form-control" name="quantidade"></div>
<div class="mb-3"><label class="form-label">Preço</label><input class="form-control" name="precoVenda"></div>
<button class="btn btn-primary">Salvar</button>
</form></body></html>