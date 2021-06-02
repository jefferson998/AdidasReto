$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/BuscadorAdidas.feature");
formatter.feature({
  "name": "Buscador de productos",
  "description": "  Como ususario de Adidas\n  Quiero elegir un producto\n  y validar nombre",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Buscar producto de adidas exitoso",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Me encuentro en la pagina de Adidas",
  "keyword": "Given "
});
formatter.match({
  "location": "AdidasStepDefinitions.meEncuentroEnLaPaginaDeAdidas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Buscar un producto",
  "keyword": "When "
});
formatter.match({
  "location": "AdidasStepDefinitions.buscarUnProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ver el producto",
  "keyword": "Then "
});
formatter.match({
  "location": "AdidasStepDefinitions.verElProducto()"
});
formatter.result({
  "status": "passed"
});
});