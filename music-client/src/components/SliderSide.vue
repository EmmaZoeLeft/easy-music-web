<template>
  <div class="sidebar">
    <el-menu
      class="sidebar-el-menu"
      :default-active="onRoutes"
      :collapse="collapse"
      background-color="#242526"
      text-color="#B0B3B2"
      active-text-color="#ffffff"
      unique-opened
      router
    >
      <template v-for="item in navMsg">
          <template>
            <el-menu-item :class="{active: item.name === activeName}" :key="item.path" @click="goPage(item.path,item.name)">
              <span slot="name">{{ item.name }}</span>
            </el-menu-item>
        </template>
      </template>
    </el-menu>
  </div>
</template>

<script>
import _ctrEvent from '../assets/js/ctr-event'
import { navMsg } from '../assets/data/header'

export default {
  data () {
    return {
      collapse: false,
      navMsg: navMsg // 左侧导航栏
    //   items: [
    //     {
    //       icon: 'el-icon-s-data',
    //       index: 'info',
    //       title: '系统首页'
    //     },
    //     {
    //       icon: 'el-icon-user-solid',
    //       index: 'consumer',
    //       title: '用户管理'
    //     },
    //     {
    //       icon: 'el-icon-service',
    //       index: 'singer',
    //       title: '歌手管理'
    //     },
    //     {
    //       icon: 'el-icon-document',
    //       index: 'songList',
    //       title: '歌单管理'
    //     }
    //   ]
    }
  },
  computed: {
    onRoutes () {
      return this.$route.path.replace('/', '')
    }
  },
  created () {
    _ctrEvent.$on('collapse', msg => {
      this.collapse = msg
    })
  },
  methods: {
    goPage (path, value) {
      document.querySelector('.menu').classList.remove('show')
      this.changeIndex(value)
      if (!this.loginIn && path === '/my-music') {
        this.notify('请先登录', 'warning')
      } else {
        this.$router.push({path: path})
      }
    }
  }
}
</script>

<style scoped>
.sidebar {
  display: block;
  position: absolute;
  background-color: #334256;
  left: 0;
  top: 70px;
  bottom: 0;
  overflow-y: scroll;
}
.sidebar::-webkit-scrollbar {
  width: 0;
}
.sidebar-el-menu:not(.el-menu--collapse) {
  width: 150px;
}
.sidebar > ul {
  height: 100%;
}
</style>
