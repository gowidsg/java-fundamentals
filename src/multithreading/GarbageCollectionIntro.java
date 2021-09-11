/*
 * In java, garbage means unreferenced objects.

Garbage Collection is process of reclaiming the runtime unused memory automatically. In other words, it is a way to destroy the unused objects.

To do so, we were using free() function in C language and delete() in C++. But, in java it is performed automatically. So, java provides better memory management.

Advantage of Garbage Collection
It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.
 *
 *The finalize() method is invoked each time before the object is garbage collected. This method can be used to perform cleanup processing. This method is defined in Object class as
 *
 *Note: The Garbage collector of JVM collects only those objects that are created by new keyword. So if you have created any object without new, you can use finalize method to perform cleanup processing (destroying remaining objects)./
*/
package multithreading;

public class GarbageCollectionIntro {

	public void finalize() {
		System.out.println("Garbage is being collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollectionIntro g1 = new GarbageCollectionIntro();
		GarbageCollectionIntro g2 = new GarbageCollectionIntro();
		g1 = null;
		g2 = null;
		GarbageCollectionIntro g3 = new GarbageCollectionIntro();

		GarbageCollectionIntro g4 = new GarbageCollectionIntro();

		g3 = g4;
		System.gc();

		new GarbageCollectionIntro();
		// Note: Neither finalization nor garbage collection is guaranteed.
	}

}
