import React from "react";
import { Prism as SyntaxHighlighter } from "react-syntax-highlighter";
import { base16AteliersulphurpoolLight } from "react-syntax-highlighter/dist/cjs/styles/prism";

const CodeBlock = ({ language, value }) => {
  return (
    <SyntaxHighlighter
      language={language}
      style={base16AteliersulphurpoolLight}
    >
      {value}
    </SyntaxHighlighter>
  );
};
export default CodeBlock;
