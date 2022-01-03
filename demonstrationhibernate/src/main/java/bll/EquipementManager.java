package bll;

import java.util.List;

import bo.Equipement;
import dal.EquipementDAO;

public class EquipementManager {
	private EquipementDAO dao;
	
	public EquipementManager() {
		dao = new EquipementDAO();
	}
  public List<Equipement> selectAll(){
	  return dao.selectAll();
  }
  public void insert(Equipement equipement)
  {
	  dao.insert(equipement);
  }
  public void update(Equipement equipement)
  {
	  dao.update(equipement);
  }
  public void delete(Equipement equipement)
	{
	  dao.delete(equipement);
	}
}
