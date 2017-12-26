//package br.com.control;
//
//import com.mongodb.DB;
//import com.mongodb.DBCollection;
//import com.mongodb.DBCursor;
//import com.mongodb.DBObject;
//import com.mongodb.MongoClient;
//
//public class TesteMongoDb {
//	public static void main(String args[]) {
//		try {
//			// Conectando ao servidor mongodb
//			MongoClient mongo = new MongoClient( "10.0.3.220" , 27017 );
//			DB db = mongo.getDB("sfa_carga");
//			boolean auth = db.authenticate("admin", "admin".toCharArray());
//			
//			DBCollection table = db.getCollection("prod");
//
//			DBCursor cursor = table.find();
//			
//			while (cursor.hasNext()) {
//			   DBObject obj = cursor.next();
//			   System.out.println(obj.toString());
//			}
//			
//			DBCollection collection = cursor.getCollection();
//			System.out.println(collection.getCount());
//			
//		} catch (Exception e) {
//			System.err.println(e.getClass().getName() + ": " + e.getMessage());
//		}
//	}
//}
