package core;
//this class hold algorithm that handles geometry problems, 
//such as sorting polygons, find line polygon intersection

public class geometry {
	public static boolean compareModels(model a, model b){
		//compare centre Z depth values
			if(a.getZDepth() > b.getZDepth())
				return true;
			else
				return false;
		//}
		
	}
	
	//sort polygons
	public final static void sortPolygons(polygon3D[] polygons, int start){
		int length = polygons.length;
		for(int i = 1; i < length; i++){
			for(int j = start; j <length - i; j++){
				if(geometry.comparePolygons(polygons[j], polygons[j+1])){
					polygon3D temp = polygons[j+1];
					polygons[j+1] = polygons[j];
					polygons[j] = temp;
				}
			}
		}
	}
	
	//compare polygons
	public final static boolean comparePolygons(polygon3D a, polygon3D b){
		if(!a.visible)
			return false;
		if(!b.visible)
			return true;

	
		if(a.tempVertex[0].z < b.tempVertex[0].z && a.tempVertex[1].z < b.tempVertex[1].z && a.tempVertex[2].z < b.tempVertex[2].z && a.tempVertex[3].z < b.tempVertex[3].z)
			return true;

		vector tempVector = new vector(0,0,0);

		boolean inside = true;
		for(int i = 0; i < b.tempVertex.length; i++){
			tempVector.set(b.tempVertex[i]);
			tempVector.subtract(a.centre);
			tempVector.unit();

			if(tempVector.dot(a.normal) > 0.0001 ){
				inside = false;
				break;
			}

		}
		if(inside)
			return true;


		inside = true;
		for(int i = 0; i <a.tempVertex.length; i++){
			tempVector.set(a.tempVertex[i]);
			tempVector.subtract(b.centre);
			tempVector.unit();

			if(tempVector.dot(b.normal) < -0.0001 ){
				inside = false;
				break;
			}
		}

		if(inside)
			return true;

		return false;
	}
}
