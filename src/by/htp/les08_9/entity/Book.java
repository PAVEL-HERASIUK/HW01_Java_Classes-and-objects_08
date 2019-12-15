package by.htp.les08_9.entity;

public class Book {
	// 9. Создать класс Book, спецификация которого приведена ниже. Определить
	//    конструкторы, set- и get- методы и метод toString().
	//    Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
	//    Задать критерии выбора данных и вывести эти данные на консоль.
	//    Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
	// Найти и вывести:
	//   a) список книг заданного автора;
	//   b) список книг, выпущенных заданным издательством;
	//   c) список книг, выпущенных после заданного года.

	private int id;
	private String title;
	private String authors;
	private String publishingHouse;
	private int yearOfPublishing;
	private int numberOfPages;
	private int price;
	private String typeOfBinding;

	public Book(int id, String title, String authors, String publishingHouse, int yearOfPublishing, int numberOfPages,
			int price, String typeOfBinding) {
		this.id = id;
		this.title = title;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.yearOfPublishing = yearOfPublishing;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.typeOfBinding = typeOfBinding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages =numberOfPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTypeOfBinding() {
		return typeOfBinding;
	}

	public void setTypeOfBinding(String typeOfBinding) {
		this.typeOfBinding = typeOfBinding;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		result = prime * result + id;
		result = prime * result + numberOfPages;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((typeOfBinding == null) ? 0 : typeOfBinding.hashCode());
		result = prime * result + yearOfPublishing;
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
		Book other = (Book) obj;
		if (publishingHouse == null) {
			if (other.publishingHouse != null)
				return false;
		} else if (!publishingHouse.equals(other.publishingHouse))
			return false;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (id != other.id)
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (typeOfBinding == null) {
			if (other.typeOfBinding != null)
				return false;
		} else if (!typeOfBinding.equals(other.typeOfBinding))
			return false;
		if (yearOfPublishing != other.yearOfPublishing)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", authors=" + authors + ", publishingHouse=" + publishingHouse
				+ ", yearOfPublishing=" + yearOfPublishing + ", numberOfPages=" + numberOfPages + ", price=" + price
				+ ", typeOfBinding=" + typeOfBinding + "]";
	}
}
