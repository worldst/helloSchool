package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Offer;




@Repository("offerDAO")
public class OfferDAO {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		
		String sqlStatement = "select count(*) from offers";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
	}


	public Offer getOffer(String name) {
		String sqlStatement = "select * from offers where name=?";

		return jdbcTemplate.queryForObject(sqlStatement, new Object[] {name}, 
				new RowMapper<Offer>() {
			
			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Offer offer = new Offer();
				
				offer.setYear(rs.getInt("year"));
				offer.setSemester(rs.getInt("semester"));
				offer.setCode(rs.getString("code"));
				offer.setName(rs.getString("name"));
				offer.setEtc(rs.getString("etc"));
				offer.setNum(rs.getInt("num"));

				return offer;
				
			}

		});
	}
	
	public List<Offer> getOffers() {
		String sqlStatement = "select year,semester,sum(num) from offers group by year,semester";
		
		return jdbcTemplate.query(sqlStatement,
				new RowMapper<Offer>() {

					@Override
					public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Offer offer = new Offer();

					

						offer.setYear(rs.getInt("year"));
						offer.setSemester(rs.getInt("semester"));
						
						offer.setNum(rs.getInt("sum(num)"));
						
						
						return offer;
					
			
				
			}
		
		}
		);
	}
	
	public List<Offer> getOffers10() {
		String sqlStatement = "select code, name, etc, num from person";
		
		return jdbcTemplate.query(sqlStatement,
				new RowMapper<Offer>() {

					@Override
					public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Offer offer = new Offer();

					
						offer.setCode(rs.getString("code"));
						offer.setName(rs.getString("name"));
						offer.setEtc(rs.getString("etc"));
						offer.setNum(rs.getInt("num"));
						
						
						return offer;
					
			
				
			}
		
		}
		);
	}
	
	public List<Offer> getOffers2() {
		String sqlStatement = "select etc, sum(num) from offers group by etc";
		
		return jdbcTemplate.query(sqlStatement,
				new RowMapper<Offer>() {

					@Override
					public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Offer offer = new Offer();

					
						
						offer.setEtc(rs.getString("etc"));
						offer.setNum(rs.getInt("sum(num)"));
						
						
						return offer;
					
			
				
			}
		
		}
		);
	}
	
	public List<Offer> getOffers3() {
		String sqlStatement = "select sum(num) from offers";
		
		return jdbcTemplate.query(sqlStatement,
				new RowMapper<Offer>() {

					@Override
					public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Offer offer = new Offer();

					
					
						offer.setNum(rs.getInt("sum(num)"));
						
						
						return offer;
					
			
				
			}
		
		}
		);
	}
	
	public List<Offer> getOffersdetail() {
		String sqlStatement = "select code, name, etc, num from offers where year='2012' and semester='1'";
		
		return jdbcTemplate.query(sqlStatement,
				new RowMapper<Offer>() {

					@Override
					public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Offer offer = new Offer();

					
					
						
						offer.setCode(rs.getString("code"));
						offer.setName(rs.getString("name"));
						offer.setEtc(rs.getString("etc"));
						offer.setNum(rs.getInt("num"));
						
						
						return offer;
					
			
				
			}
		
		}
		);
	}
	
	public List<Offer> getOffersdetail2() {
		String sqlStatement = "select code, name, etc, num from offers where year='2012' and semester='2'";
		
		return jdbcTemplate.query(sqlStatement,
				new RowMapper<Offer>() {

					@Override
					public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Offer offer = new Offer();

					
					
						
						offer.setCode(rs.getString("code"));
						offer.setName(rs.getString("name"));
						offer.setEtc(rs.getString("etc"));
						offer.setNum(rs.getInt("num"));
						
						
						return offer;
					
			
				
			}
		
		}
		);
	}
	
	public List<Offer> getOffersdetail3() {
		String sqlStatement = "select code, name, etc, num from offers where year='2015' and semester='1'";
		
		return jdbcTemplate.query(sqlStatement,
				new RowMapper<Offer>() {

					@Override
					public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Offer offer = new Offer();

					
					
						
						offer.setCode(rs.getString("code"));
						offer.setName(rs.getString("name"));
						offer.setEtc(rs.getString("etc"));
						offer.setNum(rs.getInt("num"));
						
						
						return offer;
					
			
				
			}
		
		}
		);
	}
	
	public List<Offer> getOffersdetail4() {
		String sqlStatement = "select code, name, etc, num from offers where year='2015' and semester='2'";
		
		return jdbcTemplate.query(sqlStatement,
				new RowMapper<Offer>() {

					@Override
					public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Offer offer = new Offer();

					
					
						
						offer.setCode(rs.getString("code"));
						offer.setName(rs.getString("name"));
						offer.setEtc(rs.getString("etc"));
						offer.setNum(rs.getInt("num"));
						
						
						return offer;
					
			
				
			}
		
		}
		);
	}
	
	public List<Offer> getOffersdetail5() {
		String sqlStatement = "select code, name, etc, num from offers where year='2016' and semester='1'";
		
		return jdbcTemplate.query(sqlStatement,
				new RowMapper<Offer>() {

					@Override
					public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Offer offer = new Offer();

					
					
						
						offer.setCode(rs.getString("code"));
						offer.setName(rs.getString("name"));
						offer.setEtc(rs.getString("etc"));
						offer.setNum(rs.getInt("num"));
						
						
						return offer;
					
			
				
			}
		
		}
		);
	}
	
	public List<Offer> getOffersdetail6() {
		String sqlStatement = "select code, name, etc, num from offers where year='2016' and semester='2'";
		
		return jdbcTemplate.query(sqlStatement,
				new RowMapper<Offer>() {

					@Override
					public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Offer offer = new Offer();

					
					
						
						offer.setCode(rs.getString("code"));
						offer.setName(rs.getString("name"));
						offer.setEtc(rs.getString("etc"));
						offer.setNum(rs.getInt("num"));
						
						
						return offer;
					
			
				
			}
		
		}
		);
	}
	
	public List<Offer> getOffersdetail7() {
		String sqlStatement = "select code, name, etc, num from offers where year='2017' and semester='1'";
		
		return jdbcTemplate.query(sqlStatement,
				new RowMapper<Offer>() {

					@Override
					public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Offer offer = new Offer();

					
					
						
						offer.setCode(rs.getString("code"));
						offer.setName(rs.getString("name"));
						offer.setEtc(rs.getString("etc"));
						offer.setNum(rs.getInt("num"));
						
						
						return offer;
					
			
				
			}
		
		}
		);
	}
	
	

		public boolean insert(Offer offer) {
			
		
			String code = offer.getCode();
			String name = offer.getName();
			String etc = offer.getEtc();
			int num = offer.getNum();
			
			String sqlStatement = "insert into person (code,name,etc,num) values (?,?,?,?)";
			return (jdbcTemplate.update(sqlStatement, new Object[] {code, name, etc, num}) == 1);
		}
		/*
		public boolean update(Offer offer) {
			
			int year = offer.getYear();
			int semester = offer.getSemester();
			String code = offer.getCode();
			String name = offer.getName();
			String etc = offer.getEtc();
			int num = offer.getNum();
			
			String sqlStatement = "update offers set name=?, email=?, text=? where id=?";
			
			return (jdbcTemplate.update(sqlStatement, new Object[] {name, email, text, id}) == 1);
			
		}
		
		public boolean delete(int id) {
			String sqlStatement = "delete from offers where id=?";
			return (jdbcTemplate.update(sqlStatement, new Object[] {id}) == 1);
		}
		*/
		
		
}
