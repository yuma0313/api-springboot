export async function getAllBlogData() {
  const res = await fetch(
    new URL(`${process.env.NEXT_PUBLIC_RESTAPI_URL}api/blogs/`)
  );
  const blogs = await res.json();
  const filteredBlogs = blogs.sort(
    (a, b) => new Date(b.created_at) - new Date(a.created_at)
  );
  return filteredBlogs;
}

export async function getAllBlogIds() {
  const res = await fetch(
    new URL(`${process.env.NEXT_PUBLIC_RESTAPI_URL}api/blogs/`)
  );
  const blogs = await res.json();
  return blogs.map((post) => {
    return {
      params: {
        id: String(post.id),
      },
    };
  });
}

export async function getBlogData(id) {
  const res = await fetch(
    new URL(`${process.env.NEXT_PUBLIC_RESTAPI_URL}api/blog/${id}/`)
  );
  const blog = res.json();
  return blog;
}
