package com.github.ericvanderwal.truffleintellij.services

import com.github.ericvanderwal.truffleintellij.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
