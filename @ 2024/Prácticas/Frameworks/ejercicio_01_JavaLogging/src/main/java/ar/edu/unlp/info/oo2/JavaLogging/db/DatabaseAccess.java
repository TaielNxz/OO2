package ar.edu.unlp.info.oo2.JavaLogging.db;

import java.util.Collection;
import java.util.List;

public interface DatabaseAccess {
	
	 /**
	 * Realiza la inserción de nueva información en la base de datos y
	 * retorna el id que recibe la nueva inserción
	 *
	 * @param rowData
	 * @return
	 */
	int insertNewRow(List<String> rowData);

	 /**
	 * Retorna una colección de acuerdo al texto que posee "queryString"
	 *
	 * @param queryString
	 * @return
	 */
    Collection<String> getSearchResults(String queryString);
    
}