package by.htp.les08_9.entity;

import  java.util.List; 
import java.util.ArrayList;

public class Library{
	
		private String name;
		private library List<Book>;
		
			
		public Library( String name) {
			this.name = name;
			this.library = new ArrayList<Book>();
		}

		public Library(String name,library ArrayList <Book>) {
			this.name = name;
			this.library = library;
		}

		public String getName() {
			return name;
		}

		public void setName (String name) {
			this.name = name;
		}

		public  List<Book> getLibrary() {
			return library;
		}

		public  void  setLibrary(library List<Book>) {
			this.library = libarry;
		}

		public book  getLibrary(int index) {
			return library.get(index);
		}

		public  void  setLibrary(Book book) {
			this.library.add(book);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Library other = (Library) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Library [name=" + name + "]";
		}

}
