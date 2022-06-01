# GarbageCollectionWorkshop

Here is some ideas about JVM run-time data area, so you don't need to google it ;)


=====Heap and Stack memory=====

Heap memory is used by all the parts of the application, but stack memory is only used by one thread.


Stack memory is a physical space in RAM used to allocate method execution order and references of objects.

Heap memory contains all objects and allocated dynamically, and to remove unused objects automatically we use garbage collectors.

Heap memory is divided to two parts : old and young genenration


====== new and old generation memory========

 Two of them are in the heap memory.
 
 Newly created objects are allocated in the new generation memory and after, if this objects requires larger space he gets transfered into old generation memory 
 or the survived objects after several garabage collectors cycles they gets promoted into old generation memory.
