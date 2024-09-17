const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot3zy71/",
            name: "springboot3zy71",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot3zy71/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "宠物商店系统"
        } 
    }
}
export default base
