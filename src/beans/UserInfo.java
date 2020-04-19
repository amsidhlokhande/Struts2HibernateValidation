
package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class UserInfo
{

	private Integer id;

	private String aboutYou;

	private String country;

	private String gender;

	private String mailingList;

	private String name;

	private String password;

	@Id
    @GeneratedValue
    @Column(name="USER_ID")
	public Integer getId()
	{

		return id;
	}

	public void setId(Integer id)
	{

		this.id = id;
	}

	@Column(name="USER_ABOUT_YOU")
	public String getAboutYou()
	{

		return aboutYou;
	}

	public void setAboutYou(String aboutYou)
	{

		this.aboutYou = aboutYou;
	}
    @Column(name="USER_COUNTRY")
	public String getCountry()
	{

		return country;
	}

	public void setCountry(String country)
	{

		this.country = country;
	}

	@Column(name="USER_GENDER")
	public String getGender()
	{

		return gender;
	}
    
	public void setGender(String gender)
	{

		this.gender = gender;
	}

	@Column(name="USER_MAILINGLIST")
	public String getMailingList()
	{

		return mailingList;
	}

	public void setMailingList(String mailingList)
	{

		this.mailingList = mailingList;
	}
    @Column(name="USER_NAME") 
	public String getName()
	{

		return name;
	}

	public void setName(String name)
	{

		this.name = name;
	}
    @Column(name="USER_PASSWORD")
	public String getPassword()
	{

		return password;
	}

	public void setPassword(String password)
	{

		this.password = password;
	}

}
