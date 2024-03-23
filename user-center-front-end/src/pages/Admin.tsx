import React from 'react';
import { PageContainer } from '@ant-design/pro-components'; // 导入页面容器组件
import UserManage from "@/pages/Admin/UserManage"; // 导入用户表格组件

const Admin: React.FC = () => {
  return (
    <PageContainer>
      <UserManage /> {/* 在 Admin 页面中渲染用户表格组件 */}
    </PageContainer>
  );
};

export default Admin;
