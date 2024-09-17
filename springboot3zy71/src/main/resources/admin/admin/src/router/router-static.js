import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import discusschongwuxinxi from '@/views/modules/discusschongwuxinxi/list'
    import chongwuxinxi from '@/views/modules/chongwuxinxi/list'
    import rexiaopaixingbang from '@/views/modules/rexiaopaixingbang/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import tongzhigonggao from '@/views/modules/tongzhigonggao/list'
    import messages from '@/views/modules/messages/list'
    import orders from '@/views/modules/orders/list'
    import discussrexiaopaixingbang from '@/views/modules/discussrexiaopaixingbang/list'
    import config from '@/views/modules/config/list'
    import chongwufenlei from '@/views/modules/chongwufenlei/list'
    import chongwujiyang from '@/views/modules/chongwujiyang/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/discusschongwuxinxi',
        name: '宠物信息评论',
        component: discusschongwuxinxi
      }
      ,{
	path: '/chongwuxinxi',
        name: '宠物信息',
        component: chongwuxinxi
      }
      ,{
	path: '/rexiaopaixingbang',
        name: '热销排行榜',
        component: rexiaopaixingbang
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: '在线客服',
        component: chat
      }
      ,{
	path: '/tongzhigonggao',
        name: '通知公告',
        component: tongzhigonggao
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/discussrexiaopaixingbang',
        name: '热销排行榜评论',
        component: discussrexiaopaixingbang
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/chongwufenlei',
        name: '宠物分类',
        component: chongwufenlei
      }
      ,{
	path: '/chongwujiyang',
        name: '宠物寄养',
        component: chongwujiyang
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
