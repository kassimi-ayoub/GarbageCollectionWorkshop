# GarbageCollectionWorkshop
#AyoubKASSIMI 6/1/2022
Here is some ideas about JVM run-time data area, so you don't need to google it ;)


=====Heap and Stack memory=====

Heap memory is used by all the parts of the application, but stack memory is only used by one thread.


Stack memory is a physical space in RAM used to allocate method execution order and references of objects.

Heap memory contains all objects (allocated dynamically),  to remove unused objects automatically we use garbage collectors.

Heap memory is divided to several parts, but still the most important two are : old and young genenration.


====== new and old generation memory========

 The two of them are in the heap memory.
 
 Newly created objects are allocated in the new generation memory, if this object requires larger space he gets transfered into old generation memory 
 or the survived objects after several garabage collectors cycles they get promoted into old generation memory.
