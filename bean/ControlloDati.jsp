<!DOCTYPE HTML><html lang="en">
<html>
<head>
<title>Controllo Dati</title>
</head>
<body bgcolor="#008B8B">
	<h3> Controllo dati per verificare se il telefono è disponibile</h3>
	<jsp:useBean id="Cliente" class="mieiBean.Smartphone"/>
	<jsp:setProprety name = "Cellulare" property = "telefono"  />
	<jsp:setProprety name = "Cellulare" property = "memoria" />
	<jsp:setProprety name = "Persona" property = "nome" />
<div>
	<h3>Dettagli Acquisto</h3>
</div>
<p> Telefono :
	<jsp:getProperty name = "Cellulare" property = "telefono" />
</p>
<p> Et&agrave della persona :
	<jsp:getProperty name = "Cellulare" property = "memoria" />
</p>

<p> Livello della persona :
	<jsp:getProperty name = "Persona" property = "nome" />
</p>
<p> Costo del telefono :
	<jsp:getProperty name = "Persona" property = "costo" />
</p>

</body>
</html>

