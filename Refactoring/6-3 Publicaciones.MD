# Ejercicio 6.3
## Iteracion 1
### Bad smell: Long method, imperative loops

```java
public class PostApp {
	private List<Post> posts = new ArrayList<>();
	public List<Post> ultimosPosts(Usuario user, int cantidad) {
        
	    List<Post> postsOtrosUsuarios = new ArrayList<Post>();
	    for (Post post : this.posts) {
	        if (!post.getUsuario().equals(user)) {
	            postsOtrosUsuarios.add(post);
	        }
	    }
	        
	   // ordena los posts por fecha
	   for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
	       int masNuevo = i;
	       for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
	           if (postsOtrosUsuarios.get(j).getFecha().isAfter(
	     postsOtrosUsuarios.get(masNuevo).getFecha())) {
	              masNuevo = j;
	           }    
	       }
	      Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
	      postsOtrosUsuarios.set(masNuevo, unPost);    
	   }
	        
	    List<Post> ultimosPosts = new ArrayList<Post>();
	    int index = 0;
	    Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
	    while (postIterator.hasNext() &&  index < cantidad) {
	        ultimosPosts.add(postIterator.next());
	    }
	    return ultimosPosts;
	}
}
```
### Refactoring
replace loop with pipeline
### Aplicacion
```java
	public List<Post> ultimosPosts(Usuario user, int cantidad) {
        
	    List<Post> postsOtrosUsuarios = this.posts.stream()
	    		.filter(u -> !u.getUsuario().equals(user))
	    			.toList();
	    
	   // ordena los posts por fecha
	   postsOtrosUsuarios.sort(
			   (p1,p2) -> p2.getFecha().compareTo(p1.getFecha())
			   );
	   return postsOtrosUsuarios.stream().limit(cantidad).toList();
	}
```
## Iteracion 2
### Bad smell: long method
### Refactoring
extract method
### Aplicacion
````java
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
```