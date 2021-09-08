/*
 * 
 * A java package is a group of similar types of classes, interfaces and sub-packages.

Package in java can be categorized in two form, built-in package and user-defined package.

There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

Here, we will have the detailed learning of creating and using user-defined packages.

Advantage of Java Package
1) Java package is used to categorize the classes and interfaces so that they can be easily maintained.

2) Java package provides access protection.

3) Java package removes naming collision.


 *How to compile java package
 *If you are not using any IDE, you need to follow the syntax given below:
 *javac -d directory javafilename   
 * -d tells where to put the class file
 * 
 * How to run java package program
 * You need to use fully qualified name e.g. mypack.Simple etc to run the class.
 * 
 * To Compile: javac -d . PackageIntroduction.java
 * To Run: java package_tutorial.PackageIntroduction
 * 
 * 
 * There are three ways to access the package from outside the package.
 * import package.*;
 * import package.classname;
 * fully qualified name.
 * 
 * If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages.
 * 
 * If you import package.classname then only declared class of this package will be accessible.
 * 
 * If you import a package, subpackages will not be imported.
 * If you import a package, all the classes and interface of that package will be imported excluding the classes and interfaces of the subpackages. 
 * Hence, you need to import the subpackage as well.
 *
 */

package package_tutorial;

import inheritance.Employee;

public class PackageIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Package Introduction in Way of Shivam");

		// If you use fully qualified name then only declared class of this
		// package will be accessible. Now there is no need to import. But you
		// need to use fully qualified name every time when you are accessing
		// the class or interface.
		//
		// It is generally used when two packages have same class name e.g.
		// java.util and java.sql packages contain Date class.
		inheritance.Employee e = new Employee();
		System.out.println(e.salary);

	}

}
