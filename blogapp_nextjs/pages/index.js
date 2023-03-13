import Blog from "../components/Blog";
import Layout from "../components/Layout";
import { getAllBlogData } from "../lib/blogs";

export default function Home({ filteredBlogs }) {
  return (
    <Layout title="ブログ一覧">
      <div className="flex justify-around mx-5 min-h-[calc(100vh_-_100px)]">
        <div className="p-3 my-3 bg-gray-300 w-3/5">
          <ul>
            {filteredBlogs &&
              filteredBlogs.map((blog) => <Blog key={blog.id} blog={blog} />)}
          </ul>
        </div>
        <div className="p-3 my-3 bg-gray-300 w-72 ">
          <div className="bg-gray-500">検索</div>
          <div className="mt-3 bg-gray-500">プロフィール</div>
        </div>
      </div>
    </Layout>
  );
}

export async function getStaticProps() {
  const filteredBlogs = await getAllBlogData();
  return {
    props: { filteredBlogs },
    revalidate: 3,
  };
}
