import Link from "next/link";

const Blog = ({ blog }) => {
  return (
    <div>
      <Link href={`/blogs/${blog.id}`}>
        <div className="cursor-pointer ">
          <p className="text-3xl font-bold">{blog.title}</p>
          <p className="mb-3">{blog.created_at}</p>
        </div>
      </Link>
    </div>
  );
};

export default Blog;
