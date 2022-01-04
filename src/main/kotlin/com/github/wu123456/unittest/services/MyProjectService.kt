package com.github.wu123456.unittest.services

import com.intellij.openapi.project.Project
import com.github.wu123456.unittest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
