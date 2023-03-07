import org.dizitart.no2.*
import org.dizitart.no2.Document.createDocument
import org.dizitart.no2.IndexOptions.indexOptions
import org.dizitart.no2.objects.filters.ObjectFilters.*
import java.util.*


class NitriteDbEg {
}

fun main() {
    try {
        val db = Nitrite.builder()
            .compressed()
            .filePath("/tmp/test.db")
            .openOrCreate("user", "password")

        // Create a Nitrite Collection
        val collection = db.getCollection("test")

        // create a document to populate data
        val doc = createDocument("firstName", "Rama")
            ?.put("lastName", "1234")
            ?.put("birthDay", Date())
            ?.put("data", byteArrayOf(1, 2, 3))
            ?.put("fruits", object : ArrayList<String?>() {
                init {
                    add("apple")
                    add("orange")
                }
            })
            ?.put("note", "a quick brown fox jump over the lazy dog")
//
//        println(doc?.id)
//        val insertStatus = collection.insert(doc);
//        println("Insert status: ${insertStatus.affectedCount}")

        // update the document
//        val updateStatus = collection.remove(
//            eq("firstName", "John"),
////            createDocument("lastName", "Wick")
//        );
//        println("Update status: ${updateStatus.affectedCount}")

        // create document index
//        collection.createIndex("firstName", indexOptions(IndexType.NonUnique));
//        collection.createIndex("note", indexOptions(IndexType.Fulltext));

        val cursor: Cursor = collection.find(
//            and(
                eq("firstName", "John"),
//                elemMatch("data", lt("$", 4)),
//                elemMatch("fruits", regex("$", "orange")),
//                text("note", "quick")
//            )
        )

        for (document in cursor) {
            println("id: ${document.id} ${document["firstName"]}")
        }

    } catch (e: Exception) {
        println("Exception: ${e.message}")
    }
    println("----------- Done -----------")
}