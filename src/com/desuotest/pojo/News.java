package com.desuotest.pojo;

public class News {
	//ͼ�ı���
	private String title;
	//ͼ�ķ����media_id
	private String thumb_media_id;
	//ͼ�ķ����Ƿ���ʾ��������(0/1)
	private int show_cover_pic;
	//ͼ������
	private String author;
	//ͼ��ժҪ
	private String digest;
	//ͼ������
	private String content;
	//ͼ��ҳ��URL
	private String url;
	//�Ķ�ԭ�ĵ�URL
	private String content_source_url;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getThumb_media_id() {
		return thumb_media_id;
	}
	public void setThumb_media_id(String thumb_media_id) {
		this.thumb_media_id = thumb_media_id;
	}
	public int getShow_cover_pic() {
		return show_cover_pic;
	}
	public void setShow_cover_pic(int show_cover_pic) {
		this.show_cover_pic = show_cover_pic;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDigest() {
		return digest;
	}
	public void setDigest(String digest) {
		this.digest = digest;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getContent_source_url() {
		return content_source_url;
	}
	public void setContent_source_url(String content_source_url) {
		this.content_source_url = content_source_url;
	}
	
}