<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
    <a class="navbar-brand" href="<c:url value='/'/>">Objects Properties</a>
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="" data-original-title="Dashboard">
          <a class="nav-link" href="<c:url value='/'/>">
            <i class="fa fa-fw fa-home"></i>
            <span class="nav-link-text">Home</span>
          </a>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="" data-original-title="Menu Levels">
          <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseMulti" data-parent="#exampleAccordion">
            <i class="fa fa-fw fa-lightbulb-o"></i>
            <span class="nav-link-text">Idea</span>
          </a>
          <ul class="sidenav-second-level collapse" id="collapseMulti">
            <li>
              <a class="nav-link" href="<c:url value='/idea/idealayout'/>">
              <i class="fa fa-fw fa-file-image-o"></i>
              <span class="nav-link-text">Layout</span></a>
            </li>
            <li>
              <a class="nav-link-collapse collapsed" data-toggle="collapse" href="#collapseMulti2">
              <i class="fa fa-fw fa-cogs"></i>
              Customize Fields</a>
              <ul class="sidenav-third-level collapse" id="collapseMulti2">
                <li>
                  <a href="<c:url value='/idea/customize/ideadetails'/>">Details</a>
                </li>
                <li>
                  <a href="<c:url value='/idea/customize/ideagel'/>">Gel Scripts</a>
                </li>
                <li>
                  <a href="<c:url value='/idea/customize/ideaactions'/>">Steps Actions</a>
                </li>
                <li>
                  <a href="<c:url value='/idea/customize/ideastart'/>">Start Option</a>
                </li>
                <li>
                  <a href="<c:url value='/idea/customize/ideanotifications'/>">Notifications</a>
                </li>
                <li>
                  <a href="<c:url value='/idea/customize/ideaconditions'/>">PRE or POST Conditions</a>
                </li>
              </ul>
            </li>
          </ul>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="" data-original-title="Menu Levels">
          <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseMulti3" data-parent="#exampleAccordion">
            <i class="fa fa-fw fa-rocket"></i>
            <span class="nav-link-text">Project</span>
          </a>
          <ul class="sidenav-second-level collapse" id="collapseMulti3">
            <li>
              <a class="nav-link" href="<c:url value='/project'/>">
              <i class="fa fa-fw fa-file-image-o"></i>
              <span class="nav-link-text">Layout</span></a>
            </li>
            <li>
              <a class="nav-link-collapse collapsed" data-toggle="collapse" href="#collapseMulti4">
              <i class="fa fa-fw fa-cogs"></i>
              Customize Fields</a>
              <ul class="sidenav-third-level collapse" id="collapseMulti4">
                <li>
                  <a href="#">Details</a>
                </li>
                <li>
                  <a href="#">Gel Scripts</a>
                </li>
                <li>
                  <a href="#">Steps Actions</a>
                </li>
                <li>
                  <a href="#">Start Option</a>
                </li>
                <li>
                  <a href="#">Notifications</a>
                </li>
                <li>
                  <a href="#">PRE or POST Conditions</a>
                </li>
              </ul>
            </li>
          </ul>
        </li>
      </ul>
      <ul class="navbar-nav sidenav-toggler">
        <li class="nav-item">
          <a class="nav-link text-center" id="sidenavToggler">
            <i class="fa fa-fw fa-angle-left"></i>
          </a>
        </li>
      </ul>
      <ul class="navbar-nav ml-auto">
        <li class="nav-item">
          <form class="form-inline my-2 my-lg-0 mr-lg-2">
            <div class="input-group">
              <input class="form-control" type="text" placeholder="Search for...">
              <span class="input-group-append">
                <button class="btn btn-primary" type="button">
                  <i class="fa fa-search"></i>
                </button>
              </span>
            </div>
          </form>
        </li>
      </ul>
    </div>
  </nav>