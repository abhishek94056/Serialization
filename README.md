Q. What is Serialization?
A. To save the object of any class into the file.

Q. What is De-serialization?
A. To read the object of any class from the file.

Q. Why to achieve Serialization?
A. For security purpose and for easy transfers

Classes involved in Serialization:

FileOutputStream -> Can write file
ObjectOutputStream -> Can write object

Classes involved in De-Serialization:

ObjectInputStream -> Can read object
FileInputStream -> Can read file


Interview Questions:

1. What is Serialization and why to achieve it?
	Serialization is the process of converting an object into a format that can be stored in a file or sent over a network. 
It helps in:
	Saving object data to a file for future use.
	Transferring objects over a network (like sending data between client and server).
	Security, as data can be encrypted and stored safely.

2. What is difference between Serialization and De-Serialization?
		Serialization	                                De-Serialization
	Converts an object into a byte stream      	Converts the byte stream back into an object
	Used for storing/sending object data	        Used for retrieving/reading object data
	Uses ObjectOutputStream and FileOutputStream	Uses ObjectInputStream and FileInputStream

3. What is transient keyword?
	The transient keyword is used to skip certain variables during serialization. 
	If a variable is marked as transient, it will not be saved in the file.
4. What is marker interface and why to use it?
	A marker interface is an interface without any methods or fields. It is used to indicate (or "mark") a class for special behavior.

	Example:
	Serializable is a marker interface. When a class implements Serializable, it tells Java that objects of this class can be serialized.

	Why use it?
	It provides a way to give special behavior to classes without adding methods.
	Java internally checks if a class implements a marker interface and applies related rules.

5. Can we create our own marker/tagged interface?
	Yes! You can create your own marker interface.
