package es.cd.dsnd.to.model.core.service;

	
	import java.util.List;
	import java.util.Map;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.Lazy;
	import org.springframework.stereotype.Service;

	import es.cd.dsnd.to.api.core.service.ITemplateOrganization;
	import es.cd.dsnd.to.model.core.dao.employeeDao;
	import com.ontimize.jee.common.dto.EntityResult;
	import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
	import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

	@Service("TemplateOrganization")
	@Lazy
	public class TemplateOrganization implements ITemplateOrganization{
	 
	 @Autowired private employeeDao employeeDao;
	 @Autowired private DefaultOntimizeDaoHelper daoHelper;
	 
	 @Override
	 public EntityResult employeeQuery(Map<String, Object> keyMap, List<String> attrList)
	   throws OntimizeJEERuntimeException {
	  return this.daoHelper.query(this.employeeDao, keyMap, attrList);
	 }

	 @Override
	 public EntityResult employeeInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
	  return this.daoHelper.insert(this.employeeDao, attrMap);
	 }

	 @Override
	 public EntityResult employeeUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
	   throws OntimizeJEERuntimeException {
	  return this.daoHelper.update(this.employeeDao, attrMap, keyMap);
	 }

	 @Override
	 public EntityResult employeeDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
	  return this.daoHelper.delete(this.employeeDao, keyMap);
	 }


}