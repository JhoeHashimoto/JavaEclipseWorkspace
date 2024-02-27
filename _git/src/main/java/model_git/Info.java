package model_git;

public class Info {
	
	
	private String login;
	private String name;
	private String public_repos;
	private int followers;


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublic_repos() {
		return public_repos;
	}

	public void setPublic_repos(String public_repos) {
		this.public_repos = public_repos;
	}

	public int getFollowers(){
		return followers;
	}

	public void setSeguidores(int followers) {
		this.followers = followers;
	}

	@Override
	public String toString() {
		return "Info [login=" + login + ", nome=" + name + ", qtndRep=" + public_repos + ", seguidores=" + followers + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
