Aplicacion de manejo de usuarios mediante una API REST

Instructivo de ejecuccion:

1- Se ejecuta la Spring Boot App para tener disponible y poder consumir la api rest

2- En este caso, utilizaremos Postman como cliente:

	2.1- Previamente instalado en el equipo, se ejecuta el aplicativo Postman
	2.2- Creamos un archivo nuevo de tipo Basic HTTP Request
	3.3- Usaremos la siguiente dirección 'http://localhost:8086/api/v1/users' 
		tanto en el metodo GET (listar los usuarios) como en 
			 el metodo POST (agregar usuarios)
	4.4- El endpoit de agregar usuarios se debe respetar el siguiente formato JSON:
		{
  			"name": "Juan Rodriguez",
  			"email": "juan@rodriguez.org",
  			"password": "hunter2",
  			"phones": [
    				{
      				"number": "1234567",
      				"citycode": "1",
      				"countrycode": "57"
    				},
    				{
      				"number": "1234567",
      				"citycode": "1",
      				"countrycode": "57"
    				}
  				]
		}

	Consideraciones importantes:

	- Si intenta ingresar un correo existente en la base de datos, no podrá realizar el registro.
	- El formato del correo debe ser valido: correo@dominio.cl
	- La contraseña debera cumplir con lo siguiente: 
		8 caracteres, al menos una mayuscula, una minuscula, y dos digitos numericos.





