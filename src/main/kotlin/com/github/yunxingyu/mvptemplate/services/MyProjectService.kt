package com.github.yunxingyu.mvptemplate.services

import com.github.yunxingyu.mvptemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
