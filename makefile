limpiar:
	rm -rf bin
compilar:limpiar
	mkdir bin
	javac src/personas/Musico.java -d bin
	javac src/personas/Director.java -cp bin -d bin
	javac src/personas/MusicoSocio.java -cp bin -d bin
	javac src/personas/MusicoRefuerzo.java -cp bin -d bin
	javac src/personas/BandaMusica.java -cp bin -d bin
	javac src/actos/Actuacion.java -cp bin -d bin
	javac src/ejecucion/Principal.java -cp bin -d bin
	

