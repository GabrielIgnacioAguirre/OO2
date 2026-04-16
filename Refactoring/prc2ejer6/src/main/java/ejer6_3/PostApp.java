package ejer6_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PostApp {
	private List<Post> posts = new ArrayList<>();
	
	public List<Post> ultimosPosts(Usuario user, int cantidad) {
		List<Post> postsOtrosUsuarios = extraerUsuarios(user);
	    postsOtrosUsuarios.sort((p1,p2) -> p2.getFecha().compareTo(p1.getFecha()));
	    return postsOtrosUsuarios.stream().limit(cantidad).toList();
	}
	
	protected List<Post> extraerUsuarios(Usuario user) {
		List<Post> postsOtrosUsuarios = this.posts.stream()
	    		.filter(u -> !u.getUsuario().equals(user))
	    			.toList();
		return postsOtrosUsuarios;
	}
}
